package ky2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f395108a;

    /* renamed from: b, reason: collision with root package name */
    public final ky2.s f395109b;

    /* renamed from: c, reason: collision with root package name */
    public int f395110c;

    public r(java.lang.String choice, ky2.s settingItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choice, "choice");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingItem, "settingItem");
        this.f395108a = choice;
        this.f395109b = settingItem;
        this.f395110c = i17;
    }

    /* renamed from: equals */
    public boolean m144613xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky2.r)) {
            return false;
        }
        ky2.r rVar = (ky2.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f395108a, rVar.f395108a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f395109b, rVar.f395109b) && this.f395110c == rVar.f395110c;
    }

    /* renamed from: hashCode */
    public int m144614x8cdac1b() {
        return (((this.f395108a.hashCode() * 31) + this.f395109b.m144617x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f395110c);
    }

    /* renamed from: toString */
    public java.lang.String m144615x9616526c() {
        return "VoteItem(choice=" + this.f395108a + ", settingItem=" + this.f395109b + ", itemType=" + this.f395110c + ')';
    }
}
