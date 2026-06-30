package ap1;

/* loaded from: classes5.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.b2 f12767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ap1.b2 b2Var) {
        super(1);
        this.f12767d = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        ap1.b2 b2Var = this.f12767d;
        if (dVar != null && (dVar instanceof ap1.e2)) {
            ap1.e2 e2Var = (ap1.e2) dVar;
            if (b2Var.f12615d == null) {
                android.view.View inflate = ((android.view.ViewStub) b2Var.getRootView().findViewById(com.tencent.mm.R.id.rjt)).inflate();
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                b2Var.f12615d = linearLayout;
                android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.rgi);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                b2Var.f12616e = (android.widget.TextView) findViewById;
                android.widget.LinearLayout linearLayout2 = b2Var.f12615d;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("errorContentLl");
                    throw null;
                }
                android.view.View findViewById2 = linearLayout2.findViewById(com.tencent.mm.R.id.rgg);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                b2Var.f12617f = (android.widget.TextView) findViewById2;
                android.widget.LinearLayout linearLayout3 = b2Var.f12615d;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.o.o("errorContentLl");
                    throw null;
                }
                android.view.View findViewById3 = linearLayout3.findViewById(com.tencent.mm.R.id.rgf);
                kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                b2Var.f12618g = (android.widget.Button) findViewById3;
            }
            android.widget.LinearLayout linearLayout4 = b2Var.f12615d;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("errorContentLl");
                throw null;
            }
            linearLayout4.setVisibility(0);
            android.widget.TextView textView = b2Var.f12616e;
            if (textView == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            textView.setText(e2Var.f12648a);
            android.widget.TextView textView2 = b2Var.f12617f;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("hint");
                throw null;
            }
            java.lang.CharSequence charSequence = e2Var.f12649b;
            if (charSequence == null) {
                charSequence = "";
            }
            textView2.setText(charSequence);
            android.widget.Button button = b2Var.f12618g;
            if (button == null) {
                kotlin.jvm.internal.o.o("btn");
                throw null;
            }
            java.lang.CharSequence charSequence2 = e2Var.f12650c;
            if (charSequence2 == null) {
                charSequence2 = b2Var.getString(com.tencent.mm.R.string.m77);
            }
            button.setText(charSequence2);
            yz5.a aVar = e2Var.f12651d;
            if (aVar == null) {
                aVar = new ap1.a2(b2Var);
            }
            android.widget.Button button2 = b2Var.f12618g;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("btn");
                throw null;
            }
            button2.setOnClickListener(new ap1.z1(aVar));
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof ap1.b)) {
            android.widget.LinearLayout linearLayout5 = b2Var.f12615d;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
