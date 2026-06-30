package cr0;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.j f303149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 f303150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 f303151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cr0.j jVar, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 c10869xaaca795, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 c10869xaaca7952) {
        super(0);
        this.f303149d = jVar;
        this.f303150e = c10869xaaca795;
        this.f303151f = c10869xaaca7952;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedHashMap d17 = this.f303149d.d();
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 c10869xaaca795 = this.f303150e;
        java.lang.String accProcName = c10869xaaca795.getAccProcName();
        java.util.Iterator<T> it = c10869xaaca795.m46625x1828bc7f().values().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.Map) it.next()).values().iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                j18 += ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) it6.next()).f150223e;
            }
            j17 += j18;
        }
        d17.put(accProcName, java.lang.Long.valueOf(j17));
        this.f303151f.m46629x62fa438(c10869xaaca795);
        return jz5.f0.f384359a;
    }
}
