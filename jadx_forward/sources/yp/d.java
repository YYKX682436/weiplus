package yp;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ yp.p C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yp.p pVar) {
        super(0);
        this.C = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        for (int i17 = 0; i17 < 10; i17++) {
            arrayList.add(this.C.m(0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuHolderPool", "preloadTextDanmakuHolder: size = " + arrayList.size());
        synchronized (yp.f.f545913c) {
            yp.f.f545911a.a(0).addAll(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
