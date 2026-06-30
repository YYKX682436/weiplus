package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class db extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        super(false);
        this.f228370d = activityC16373x8a110f13;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228370d;
        activityC16373x8a110f13.m66193xd46dd964();
        activityC16373x8a110f13.mo48674x36654fab();
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = activityC16373x8a110f13.f227778a2;
        if (c22894x55bf3223 != null) {
            c22894x55bf3223.i();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16373x8a110f13.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(mo55332x76847179).a(ec3.g1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((ec3.g1) a17).R6(false);
        android.content.Intent intent = new android.content.Intent(activityC16373x8a110f13.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16365xb36db592.class);
        intent.putExtra("chatroomName", activityC16373x8a110f13.E1);
        activityC16373x8a110f13.startActivityForResult(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.F2);
    }
}
