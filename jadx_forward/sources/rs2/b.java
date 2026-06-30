package rs2;

/* loaded from: classes2.dex */
public final class b extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final int f480857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String title) {
        super(title);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f480857l = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b39;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 24};
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        if (viewGroup != null) {
            viewGroup.setPadding(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16), 0, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16), 0);
        }
    }

    @Override // zx2.c
    public int[] n() {
        int i17 = this.f480857l;
        return new int[]{i17, i17};
    }
}
