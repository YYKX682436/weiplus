package ap1;

/* loaded from: classes5.dex */
public final class d1 extends ap1.i0 {

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f12638h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // ap1.i0
    public java.lang.Object T6(kotlin.coroutines.Continuation continuation) {
        java.util.List list;
        ap1.c2 c2Var;
        java.util.HashSet hashSet;
        java.util.List list2 = this.f12638h;
        if (list2 != null) {
            if (list2 != null) {
                return list2;
            }
            kotlin.jvm.internal.o.o("contactList");
            throw null;
        }
        j75.f U6 = U6();
        if (U6 == null || (c2Var = (ap1.c2) U6.getState()) == null || (hashSet = c2Var.f12630n) == null) {
            list = kz5.p0.f313996d;
        } else {
            list = new java.util.ArrayList();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                list.add(new ap1.a0((java.lang.String) it.next(), 0L, 0L));
            }
        }
        this.f12638h = list;
        return list;
    }

    @Override // ap1.i0, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        mMActivity.hideActionbarLine();
        mMActivity.setBackBtnVisible(false);
        mMActivity.setBounceEnabled(false);
        mMActivity.setActionbarColor(getColor(com.tencent.mm.R.color.f478491c));
        mMActivity.setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479706d1);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.hwa);
        if (frameLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = dimension;
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.hvf);
        if (frameLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((android.widget.FrameLayout.LayoutParams) layoutParams2).height = dimension;
        }
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            android.view.View j17 = supportActionBar.j();
            android.widget.TextView textView = (android.widget.TextView) j17.findViewById(android.R.id.text1);
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) j17.findViewById(com.tencent.mm.R.id.ocr);
            weImageView.getLayoutParams().height = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            weImageView.getLayoutParams().width = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(getColor(com.tencent.mm.R.color.f478489a));
            gradientDrawable.setCornerRadius(getResources().getDimension(com.tencent.mm.R.dimen.f479672c9));
            weImageView.setImageDrawable(gradientDrawable);
            weImageView.setEnableColorFilter(false);
            weImageView.setVisibility(0);
        }
    }
}
