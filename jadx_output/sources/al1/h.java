package al1;

/* loaded from: classes7.dex */
public class h implements al1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al1.b f5770a;

    public h(al1.b bVar, al1.c cVar) {
        this.f5770a = bVar;
    }

    @Override // al1.e
    public void d(al1.b bVar, bm5.x0 x0Var, bm5.x0 x0Var2, android.view.View view) {
        android.widget.ImageView imageView;
        al1.b bVar2 = this.f5770a;
        if (bVar2.f5746w || bVar2.f5745v || (imageView = (android.widget.ImageView) x0Var.b()) == null) {
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.drawable.bd_);
        imageView.setColorFilter(bVar2.f5742s, android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.width = bVar2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480018lr);
        marginLayoutParams.height = bVar2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480017lq);
        marginLayoutParams.leftMargin = bVar2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480027m0);
        marginLayoutParams.rightMargin = bVar2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480029m2);
        imageView.setLayoutParams(marginLayoutParams);
    }
}
