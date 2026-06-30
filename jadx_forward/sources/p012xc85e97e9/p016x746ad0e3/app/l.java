package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.h f90726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90727b;

    public l(android.content.Context context) {
        int D = p012xc85e97e9.p016x746ad0e3.app.m.D(context, 0);
        this.f90726a = new p012xc85e97e9.p016x746ad0e3.app.h(new android.view.ContextThemeWrapper(context, p012xc85e97e9.p016x746ad0e3.app.m.D(context, D)));
        this.f90727b = D;
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    public p012xc85e97e9.p016x746ad0e3.app.m a() {
        p012xc85e97e9.p016x746ad0e3.app.k kVar;
        android.widget.ListAdapter listAdapter;
        boolean z17;
        ?? r152;
        p012xc85e97e9.p016x746ad0e3.app.h hVar = this.f90726a;
        p012xc85e97e9.p016x746ad0e3.app.m mVar = new p012xc85e97e9.p016x746ad0e3.app.m(hVar.f90662a, this.f90727b);
        p012xc85e97e9.p016x746ad0e3.app.k kVar2 = mVar.f90729f;
        android.view.View view = hVar.f90666e;
        if (view != null) {
            kVar2.C = view;
        } else {
            java.lang.CharSequence charSequence = hVar.f90665d;
            if (charSequence != null) {
                kVar2.f90696e = charSequence;
                android.widget.TextView textView = kVar2.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            android.graphics.drawable.Drawable drawable = hVar.f90664c;
            if (drawable != null) {
                kVar2.f90716y = drawable;
                kVar2.f90715x = 0;
                android.widget.ImageView imageView = kVar2.f90717z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    kVar2.f90717z.setImageDrawable(drawable);
                }
            }
        }
        java.lang.CharSequence charSequence2 = hVar.f90667f;
        if (charSequence2 != null) {
            kVar2.f90697f = charSequence2;
            android.widget.TextView textView2 = kVar2.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        java.lang.CharSequence charSequence3 = hVar.f90668g;
        if (charSequence3 != null) {
            kVar2.d(-1, charSequence3, hVar.f90669h, null, null);
        }
        java.lang.CharSequence charSequence4 = hVar.f90670i;
        if (charSequence4 != null) {
            kVar2.d(-2, charSequence4, hVar.f90671j, null, null);
        }
        if (hVar.f90674m == null && hVar.f90675n == null) {
            r152 = 0;
            kVar = kVar2;
        } else {
            p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a c0064x14e5ed4a = (p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a) hVar.f90663b.inflate(kVar2.G, (android.view.ViewGroup) null);
            if (hVar.f90679r) {
                z17 = false;
                kVar = kVar2;
                listAdapter = new p012xc85e97e9.p016x746ad0e3.app.e(hVar, hVar.f90662a, kVar2.H, android.R.id.text1, hVar.f90674m, c0064x14e5ed4a);
            } else {
                boolean z18 = false;
                kVar = kVar2;
                int i17 = hVar.f90680s ? kVar.I : kVar.f90691J;
                listAdapter = hVar.f90675n;
                z17 = z18;
                if (listAdapter == null) {
                    listAdapter = new p012xc85e97e9.p016x746ad0e3.app.j(hVar.f90662a, i17, android.R.id.text1, hVar.f90674m);
                    z17 = z18;
                }
            }
            kVar.D = listAdapter;
            kVar.E = hVar.f90681t;
            if (hVar.f90676o != null) {
                c0064x14e5ed4a.setOnItemClickListener(new p012xc85e97e9.p016x746ad0e3.app.f(hVar, kVar));
            } else if (hVar.f90682u != null) {
                c0064x14e5ed4a.setOnItemClickListener(new p012xc85e97e9.p016x746ad0e3.app.g(hVar, c0064x14e5ed4a, kVar));
            }
            if (hVar.f90680s) {
                c0064x14e5ed4a.setChoiceMode(1);
            } else if (hVar.f90679r) {
                c0064x14e5ed4a.setChoiceMode(2);
            }
            kVar.f90698g = c0064x14e5ed4a;
            r152 = z17;
        }
        android.view.View view2 = hVar.f90677p;
        if (view2 != null) {
            kVar.f90699h = view2;
            kVar.f90700i = r152;
            kVar.f90701j = r152;
        }
        mVar.setCancelable(hVar.f90672k);
        if (hVar.f90672k) {
            mVar.setCanceledOnTouchOutside(true);
        }
        mVar.setOnCancelListener(null);
        mVar.setOnDismissListener(null);
        android.content.DialogInterface.OnKeyListener onKeyListener = hVar.f90673l;
        if (onKeyListener != null) {
            mVar.setOnKeyListener(onKeyListener);
        }
        return mVar;
    }
}
