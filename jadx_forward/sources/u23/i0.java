package u23;

/* loaded from: classes10.dex */
public final class i0 extends u23.a {
    @Override // u23.a, u23.b
    public java.lang.String a() {
        return "albumpreviewui-onlykeepmediawithlocation";
    }

    @Override // u23.a, u23.b
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        if (!super.b(media) || !i11.b.a(media.f219973r) || !i11.b.b(media.f219972q)) {
            return false;
        }
        if (media.f219973r == 0.0d) {
            if (media.f219972q == 0.0d) {
                return false;
            }
        }
        return true;
    }
}
