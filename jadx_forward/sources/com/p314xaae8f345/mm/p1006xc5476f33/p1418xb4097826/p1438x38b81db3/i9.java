package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        super(0);
        this.f185184d = qeVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f185184d.f185891f.getF204176d().mo55332x76847179();
        int i17 = 0;
        if (mo55332x76847179 != null && (intent = mo55332x76847179.getIntent()) != null) {
            i17 = intent.getIntExtra("key_feed_report_enter_type", 0);
        }
        return java.lang.Integer.valueOf(i17);
    }
}
