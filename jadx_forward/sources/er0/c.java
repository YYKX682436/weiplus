package er0;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j4 f337481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.j4 j4Var, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337481d = j4Var;
        this.f337482e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map m40827x8f8c4694;
        java.util.List m40826x8f8c4694;
        r45.j4 j4Var = this.f337481d;
        java.lang.String str = j4Var.f459091e.f454289d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337482e;
            m40827x8f8c4694 = c10875xc0cf956c.m40827x8f8c4694(c10875xc0cf956c.m46707x9e267bcb());
            java.lang.Object obj = m40827x8f8c4694.get(str);
            if (obj == null) {
                obj = new java.util.ArrayList();
                m40827x8f8c4694.put(str, obj);
            }
            m40826x8f8c4694 = c10875xc0cf956c.m40826x8f8c4694((java.util.List) obj);
            m40826x8f8c4694.add(java.lang.Long.valueOf(j4Var.f459101r));
        }
        return jz5.f0.f384359a;
    }
}
