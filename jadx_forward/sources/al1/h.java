package al1;

/* loaded from: classes7.dex */
public class h implements al1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al1.b f87303a;

    public h(al1.b bVar, al1.c cVar) {
        this.f87303a = bVar;
    }

    @Override // al1.e
    public void d(al1.b bVar, bm5.x0 x0Var, bm5.x0 x0Var2, android.view.View view) {
        android.widget.ImageView imageView;
        al1.b bVar2 = this.f87303a;
        if (bVar2.f87279w || bVar2.f87278v || (imageView = (android.widget.ImageView) x0Var.b()) == null) {
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bd_);
        imageView.setColorFilter(bVar2.f87275s, android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.width = bVar2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561551lr);
        marginLayoutParams.height = bVar2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561550lq);
        marginLayoutParams.leftMargin = bVar2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561560m0);
        marginLayoutParams.rightMargin = bVar2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561562m2);
        imageView.setLayoutParams(marginLayoutParams);
    }
}
