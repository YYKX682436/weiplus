package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1014x633fb29;

/* renamed from: com.tencent.mm.plugin.account.model.VoiceActionService */
/* loaded from: classes8.dex */
public class IntentServiceC11388x5c79a3ad extends com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591 {
    @Override // com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591
    public boolean a(android.content.Intent intent, boolean z17, android.os.Bundle bundle) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceActionService", "Action is not verified");
            return false;
        }
        java.lang.String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
        java.lang.String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        java.lang.String i17 = m61.k.wi().i(kk.k.g(o25.b.a(stringExtra).getBytes())).i();
        ((dk5.s5) tg3.t1.a()).fj(i17, stringExtra2, c01.e2.C(i17), 0);
        try {
            b(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI"), stringExtra);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceActionService", e17, "updateContactMarked error", new java.lang.Object[0]);
            return true;
        }
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("/");
        java.lang.String str3 = (split == null || split.length <= 0) ? "" : split[split.length - 1];
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceActionService", "extract contact Id error, %s %s", str, str2);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.d(this, "android.permission.READ_CONTACTS", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceActionService", "no contacts permission");
            return;
        }
        android.database.Cursor query = getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{"_id"}, "contact_id=? AND data1=? AND account_type=? AND mimetype=?", new java.lang.String[]{str3, str2, "com.tencent.mm.account", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction"}, null);
        if (query == null || query.getCount() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceActionService", "updateContactMarked: false");
        } else {
            query.moveToNext();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceActionService", "updateContactMarked: %b", java.lang.Boolean.valueOf(getContentResolver().update(android.provider.ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(java.lang.String.valueOf(query.getLong(0))).appendQueryParameter("type", "short_text").build(), new android.content.ContentValues(), null, null) > 0));
        }
        if (query != null) {
            query.close();
        }
    }
}
