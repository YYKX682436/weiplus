package px1;

/* loaded from: classes12.dex */
public class l extends nx1.p {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f440363f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f440364g;

    public l(int i17, int i18, boolean z17, boolean z18) {
        super(i17, i18);
        this.f440363f = z17;
        this.f440364g = z18;
    }

    public int b() {
        return java.lang.Math.abs(this.f422849e - this.f422848d);
    }

    public boolean c(nx1.p pVar) {
        if (pVar == null) {
            return false;
        }
        if (!pVar.a()) {
            return java.lang.Math.max(this.f422848d, pVar.f422848d) < java.lang.Math.min(this.f422849e, pVar.f422849e);
        }
        int i17 = pVar.f422848d;
        int i18 = this.f422848d;
        return (i17 >= i18 && pVar.f422849e < this.f422849e) || ((i17 >= i18 && pVar.f422849e <= this.f422849e) && this.f440364g);
    }
}
