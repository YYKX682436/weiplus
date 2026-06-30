package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.ui.component.UIComponent implements zy2.n5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f101702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        y1Var.j(com.tencent.mm.R.layout.adb);
        y1Var.f212033o = true;
        y1Var.f212027f.findViewById(com.tencent.mm.R.id.ea7).setOnClickListener(new com.tencent.mm.plugin.finder.account.component.b(y1Var));
        this.f101702d = y1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
