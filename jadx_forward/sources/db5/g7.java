package db5;

/* loaded from: classes14.dex */
public class g7 {

    /* renamed from: a, reason: collision with root package name */
    public db5.h7 f309883a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f309884b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.vj f309885c = new com.p314xaae8f345.mm.ui.vj();

    public g7(android.content.Context context) {
        this.f309884b = context;
    }

    public db5.h7 a() {
        android.widget.ImageView imageView;
        android.content.Context context = this.f309884b;
        com.p314xaae8f345.mm.ui.vj vjVar = this.f309885c;
        db5.h7 h7Var = new db5.h7(context, vjVar.f292695a, vjVar.f292696b);
        java.lang.CharSequence charSequence = vjVar.f292697c;
        if (charSequence != null && charSequence.length() > 0) {
            h7Var.f309917d.setText(vjVar.f292697c);
        }
        android.graphics.drawable.Drawable drawable = vjVar.f292698d;
        if (drawable != null && (imageView = h7Var.f309918e) != null) {
            imageView.setImageDrawable(drawable);
        }
        h7Var.setCanceledOnTouchOutside(vjVar.f292699e);
        android.content.DialogInterface.OnDismissListener onDismissListener = vjVar.f292700f;
        if (onDismissListener != null) {
            h7Var.setOnDismissListener(onDismissListener);
        }
        android.content.DialogInterface.OnCancelListener onCancelListener = vjVar.f292701g;
        if (onCancelListener != null) {
            h7Var.setOnCancelListener(onCancelListener);
        }
        return h7Var;
    }
}
