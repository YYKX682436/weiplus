package xx3;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f539526a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f539527b;

    public a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, boolean z17) {
        this.f539526a = c19792x256d2725;
        this.f539527b = z17;
    }

    /* renamed from: equals */
    public boolean m176152xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx3.a)) {
            return false;
        }
        xx3.a aVar = (xx3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539526a, aVar.f539526a) && this.f539527b == aVar.f539527b;
    }

    /* renamed from: hashCode */
    public int m176153x8cdac1b() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f539526a;
        return ((c19792x256d2725 == null ? 0 : c19792x256d2725.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f539527b);
    }

    /* renamed from: toString */
    public java.lang.String m176154x9616526c() {
        return "FinderObjectDesc(finderObject=" + this.f539526a + ", unAvailable=" + this.f539527b + ')';
    }
}
