package qs1;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.m f447748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qs1.m mVar) {
        super(0);
        this.f447748d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qs1.m mVar = this.f447748d;
        int a17 = mVar.a();
        android.content.Context context = mVar.f447761a;
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        int dimension2 = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        int i17 = a17 / dimension2;
        int i18 = mVar.f447762b;
        if (i17 > i18) {
            i17 = i18;
        }
        while (true) {
            if (i17 > 1) {
                int i19 = i17 - 1;
                if (((a17 - (i17 * dimension2)) - (mVar.f447763c * 2)) / i19 >= dimension) {
                    break;
                }
                i17 = i19;
            } else if (i17 < 1) {
                i17 = 1;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
