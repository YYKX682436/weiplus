package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f183690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(java.lang.String str, yz5.a aVar) {
        super(0);
        this.f183689d = str;
        this.f183690e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDebounceMgr", "finder debounced task execute with taskID:" + this.f183689d);
        this.f183690e.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
