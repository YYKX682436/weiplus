package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp2.b f203338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f203339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(wp2.b bVar, android.widget.TextView textView) {
        super(0);
        this.f203338d = bVar;
        this.f203339e = textView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindLive: load image span complete, snn=");
        wp2.b bVar = this.f203338d;
        sb6.append(bVar.getFeedObject().m59273x80025a04());
        sb6.append(", source=");
        sb6.append(bVar.getFeedObject().getFeedObject().m76818x5d49e3ea());
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(bVar.getFeedObject().m59251x5db1b11()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", sb6.toString());
        this.f203339e.invalidate();
        return jz5.f0.f384359a;
    }
}
