package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class w80 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f196420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(android.view.ViewGroup viewGroup) {
        super(0);
        this.f196420d = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f196420d.getContext().getSystemService("vibrator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (android.os.Vibrator) systemService;
    }
}
