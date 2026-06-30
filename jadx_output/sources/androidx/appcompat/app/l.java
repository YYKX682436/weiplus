package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.h f9193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9194b;

    public l(android.content.Context context) {
        int D = androidx.appcompat.app.m.D(context, 0);
        this.f9193a = new androidx.appcompat.app.h(new android.view.ContextThemeWrapper(context, androidx.appcompat.app.m.D(context, D)));
        this.f9194b = D;
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    public androidx.appcompat.app.m a() {
        androidx.appcompat.app.k kVar;
        android.widget.ListAdapter listAdapter;
        boolean z17;
        ?? r152;
        androidx.appcompat.app.h hVar = this.f9193a;
        androidx.appcompat.app.m mVar = new androidx.appcompat.app.m(hVar.f9129a, this.f9194b);
        androidx.appcompat.app.k kVar2 = mVar.f9196f;
        android.view.View view = hVar.f9133e;
        if (view != null) {
            kVar2.C = view;
        } else {
            java.lang.CharSequence charSequence = hVar.f9132d;
            if (charSequence != null) {
                kVar2.f9163e = charSequence;
                android.widget.TextView textView = kVar2.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            android.graphics.drawable.Drawable drawable = hVar.f9131c;
            if (drawable != null) {
                kVar2.f9183y = drawable;
                kVar2.f9182x = 0;
                android.widget.ImageView imageView = kVar2.f9184z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    kVar2.f9184z.setImageDrawable(drawable);
                }
            }
        }
        java.lang.CharSequence charSequence2 = hVar.f9134f;
        if (charSequence2 != null) {
            kVar2.f9164f = charSequence2;
            android.widget.TextView textView2 = kVar2.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        java.lang.CharSequence charSequence3 = hVar.f9135g;
        if (charSequence3 != null) {
            kVar2.d(-1, charSequence3, hVar.f9136h, null, null);
        }
        java.lang.CharSequence charSequence4 = hVar.f9137i;
        if (charSequence4 != null) {
            kVar2.d(-2, charSequence4, hVar.f9138j, null, null);
        }
        if (hVar.f9141m == null && hVar.f9142n == null) {
            r152 = 0;
            kVar = kVar2;
        } else {
            androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView = (androidx.appcompat.app.AlertController$RecycleListView) hVar.f9130b.inflate(kVar2.G, (android.view.ViewGroup) null);
            if (hVar.f9146r) {
                z17 = false;
                kVar = kVar2;
                listAdapter = new androidx.appcompat.app.e(hVar, hVar.f9129a, kVar2.H, android.R.id.text1, hVar.f9141m, alertController$RecycleListView);
            } else {
                boolean z18 = false;
                kVar = kVar2;
                int i17 = hVar.f9147s ? kVar.I : kVar.f9158J;
                listAdapter = hVar.f9142n;
                z17 = z18;
                if (listAdapter == null) {
                    listAdapter = new androidx.appcompat.app.j(hVar.f9129a, i17, android.R.id.text1, hVar.f9141m);
                    z17 = z18;
                }
            }
            kVar.D = listAdapter;
            kVar.E = hVar.f9148t;
            if (hVar.f9143o != null) {
                alertController$RecycleListView.setOnItemClickListener(new androidx.appcompat.app.f(hVar, kVar));
            } else if (hVar.f9149u != null) {
                alertController$RecycleListView.setOnItemClickListener(new androidx.appcompat.app.g(hVar, alertController$RecycleListView, kVar));
            }
            if (hVar.f9147s) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (hVar.f9146r) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            kVar.f9165g = alertController$RecycleListView;
            r152 = z17;
        }
        android.view.View view2 = hVar.f9144p;
        if (view2 != null) {
            kVar.f9166h = view2;
            kVar.f9167i = r152;
            kVar.f9168j = r152;
        }
        mVar.setCancelable(hVar.f9139k);
        if (hVar.f9139k) {
            mVar.setCanceledOnTouchOutside(true);
        }
        mVar.setOnCancelListener(null);
        mVar.setOnDismissListener(null);
        android.content.DialogInterface.OnKeyListener onKeyListener = hVar.f9140l;
        if (onKeyListener != null) {
            mVar.setOnKeyListener(onKeyListener);
        }
        return mVar;
    }
}
