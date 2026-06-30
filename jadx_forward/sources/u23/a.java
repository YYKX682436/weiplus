package u23;

/* loaded from: classes10.dex */
public class a implements u23.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f505568a;

    public a(int i17) {
        this.f505568a = i17;
    }

    @Override // u23.b
    public java.lang.String a() {
        return "albumpreviewui";
    }

    @Override // u23.b
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        int i17 = this.f505568a;
        if (i17 != 1) {
            if (i17 != 2) {
                if (media.mo63659xfb85f7b0() != 1 && media.mo63659xfb85f7b0() != 2) {
                    return false;
                }
            } else if (media.mo63659xfb85f7b0() != 2) {
                return false;
            }
        } else if (media.mo63659xfb85f7b0() != 1) {
            return false;
        }
        return true;
    }
}
