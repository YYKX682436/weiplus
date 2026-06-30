package dn5;

/* loaded from: classes10.dex */
public final class d extends dn5.e {

    /* renamed from: x1, reason: collision with root package name */
    public static final int[] f323590x1 = {-855310, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, l45.q presenter) {
        super(context, presenter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
    }

    @Override // dn5.c
    public int e(int i17) {
        if (i17 < 0 || i17 >= 8) {
            return -65536;
        }
        return f323590x1[i17];
    }
}
