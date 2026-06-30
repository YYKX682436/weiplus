package kb0;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0.g f387726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kb0.g gVar) {
        super(0);
        this.f387726d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kb0.g gVar = this.f387726d;
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar : gVar.f387732c) {
            java.lang.String c17 = gVar.c(wVar, i17);
            if (c17 != null) {
                gVar.f387740k.put(gVar.b(wVar), java.lang.Integer.valueOf(i17));
                i17++;
                arrayList.add(c17);
            }
        }
        return kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
    }
}
