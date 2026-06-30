package dv3;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f325528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17) {
        super(1);
        this.f325528d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        in5.c convertData = (in5.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertData, "convertData");
        if (convertData instanceof rv3.h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = ((rv3.h) convertData).f481928d;
            if (c16997xb0aa383a.f237252p != this.f325528d && !c16997xb0aa383a.f237255s) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
