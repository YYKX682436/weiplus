package wu3;

/* loaded from: classes4.dex */
public final class f1 extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f531269n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f531270o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f531271p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f531272q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f531273r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f531274s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f531275t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context) {
        super(context, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f531275t = true;
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwh);
    }

    @Override // y9.i, p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(134218752);
            window.clearFlags(2);
        }
        this.f531272q = findViewById(com.p314xaae8f345.mm.R.id.nmv);
        this.f531269n = findViewById(com.p314xaae8f345.mm.R.id.nmy);
        this.f531270o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568667nn0);
        this.f531271p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nmz);
        this.f531273r = findViewById(com.p314xaae8f345.mm.R.id.f568668nn1);
        if (((tt3.a) tt3.b.f503570b.a()).f503565e) {
            android.view.View view = this.f531269n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f531269n;
            if (view2 != null) {
                view2.setOnClickListener(new wu3.e1(this));
            }
            if (this.f531275t) {
                android.widget.TextView textView = this.f531270o;
                if (textView != null) {
                    textView.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmf));
                }
                android.widget.ImageView imageView = this.f531271p;
                if (imageView != null) {
                    imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80192x6a605208, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
                }
            } else {
                android.widget.TextView textView2 = this.f531270o;
                if (textView2 != null) {
                    textView2.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmg));
                }
                android.widget.ImageView imageView2 = this.f531271p;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80191x5433e158, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
                }
            }
        } else {
            android.view.View view3 = this.f531269n;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view4 = this.f531272q;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = this.f531273r;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initRangeBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initRangeBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565592cv0);
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }
}
