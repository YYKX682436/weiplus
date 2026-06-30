package by0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final by0.v f36351a = new by0.v();

    public final android.view.View a(android.view.ViewGroup viewGroup, fv0.a operation, int i17, int i18, int i19, yz5.l onOperationClickListener) {
        kotlin.jvm.internal.o.g(viewGroup, "<this>");
        kotlin.jvm.internal.o.g(operation, "operation");
        kotlin.jvm.internal.o.g(onOperationClickListener, "onOperationClickListener");
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), i17);
        androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = new androidx.appcompat.widget.LinearLayoutCompat(viewGroup.getContext(), null);
        linearLayoutCompat.setTag(operation);
        linearLayoutCompat.setOrientation(1);
        linearLayoutCompat.setGravity(17);
        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(linearLayoutCompat.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj), -2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i19;
        linearLayoutCompat.setLayoutParams(layoutParams);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayoutCompat.getContext());
        weImageView.setTag("icon");
        weImageView.setImageResource(i18);
        weImageView.setEnableColorFilter(false);
        weImageView.setLayoutParams(new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(weImageView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz), weImageView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)));
        weImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        linearLayoutCompat.addView(weImageView);
        android.widget.TextView textView = new android.widget.TextView(linearLayoutCompat.getContext());
        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-2, -2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = textView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        textView.setLayoutParams(layoutParams2);
        textView.setText(r17);
        textView.setAlpha(0.5f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 10.0f);
        linearLayoutCompat.addView(textView);
        linearLayoutCompat.setOnClickListener(new by0.u(onOperationClickListener, operation));
        return linearLayoutCompat;
    }

    public final int b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(view);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        return a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(view.getContext());
    }
}
