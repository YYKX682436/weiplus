package com.tencent.mm.live.core.debug;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/live/core/debug/LiveDebugView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveDebugView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f68571d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f68572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDebugView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bqt, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.i9s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f68571d = textView;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.i9r);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f68572e = textView2;
        textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        textView2.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f484027cr1)).setOnClickListener(new do0.a(this));
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.cqz)).setOnClickListener(new do0.b(this, context));
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f484026cr0)).setOnClickListener(new do0.c(this, context));
    }
}
