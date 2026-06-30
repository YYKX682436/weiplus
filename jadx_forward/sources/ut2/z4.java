package ut2;

/* loaded from: classes3.dex */
public final class z4 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512708a;

    public z4(ut2.j5 j5Var) {
        this.f512708a = j5Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        ut2.j5 j5Var = this.f512708a;
        if (bitmap == null) {
            j5Var.g().setVisibility(8);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float dimension = j5Var.g().getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        pm0.v.X(new ut2.y4(j5Var, (width * dimension) / height, dimension));
    }
}
