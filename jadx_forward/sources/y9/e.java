package y9;

/* loaded from: classes14.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.i f541777d;

    public e(y9.i iVar) {
        this.f541777d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        y9.i iVar = this.f541777d;
        if (iVar.f541781g && iVar.isShowing()) {
            if (!iVar.f541783i) {
                android.content.res.TypedArray obtainStyledAttributes = iVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                iVar.f541782h = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                iVar.f541783i = true;
            }
            if (iVar.f541782h) {
                iVar.cancel();
            }
        }
    }
}
