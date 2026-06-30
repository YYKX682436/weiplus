package me5;

/* loaded from: classes4.dex */
public class e extends ih3.n {
    public static void e(me5.e eVar, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4) {
        eVar.getClass();
        if (context == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14516, 1, 0, 0, 0);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Contact_User", str);
        putExtra.putExtra("Contact_ChatRoomId", str2);
        putExtra.putExtra("AntispamTicket", str3);
        putExtra.putExtra("room_name", str2);
        putExtra.putExtra("Contact_Scene", 14);
        putExtra.putExtra("key_msg_id", j17);
        putExtra.putExtra("key_msg_talker", str4);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", putExtra, null);
    }

    @Override // ih3.n
    public java.lang.String a() {
        return "link_profile";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.CharSequence charSequence = (java.lang.String) map.get(str + ".separator");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (charSequence == null) {
            charSequence = "、";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".memberlist.member");
            sb6.append(i17 != 0 ? java.lang.Integer.valueOf(i17) : "");
            java.lang.String sb7 = sb6.toString();
            if (map.get(sb7) == null) {
                return spannableStringBuilder;
            }
            if (i17 != 0) {
                spannableStringBuilder.append(charSequence2);
            }
            java.lang.String str2 = (java.lang.String) map.get(sb7 + ".username");
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".nickname");
            java.lang.String str4 = (java.lang.String) map.get(sb7 + ".antispam_ticket");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgHandlerProfile", "hy: can not resolve username or nickname");
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3);
                me5.d dVar = new me5.d(this, 1, null, map, bundle, weakReference, weakReference2, str2, str4);
                dVar.m75740x3ab833d4(true);
                i18.setSpan(dVar, 0, str3.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) i18);
            }
            i17++;
        }
    }
}
