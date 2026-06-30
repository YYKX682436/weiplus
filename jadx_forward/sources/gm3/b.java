package gm3;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f355074a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f355075b;

    public b(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        c19792x256d2725 = (i17 & 2) != 0 ? null : c19792x256d2725;
        this.f355074a = str;
        this.f355075b = c19792x256d2725;
    }

    /* renamed from: equals */
    public boolean m131874xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm3.b)) {
            return false;
        }
        gm3.b bVar = (gm3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355074a, bVar.f355074a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355075b, bVar.f355075b);
    }

    /* renamed from: hashCode */
    public int m131875x8cdac1b() {
        java.lang.String str = this.f355074a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f355075b;
        return hashCode + (c19792x256d2725 != null ? c19792x256d2725.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m131876x9616526c() {
        return "FinderItem(thumbUrl=" + this.f355074a + ", finderObj=" + this.f355075b + ')';
    }
}
