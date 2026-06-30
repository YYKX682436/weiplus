package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes9.dex */
public final class p extends androidx.appcompat.widget.AppCompatButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        setMinHeight(i65.a.f(context, com.tencent.mm.R.dimen.f479921j0));
        setMinWidth(i65.a.f(context, com.tencent.mm.R.dimen.f479920iz));
        setGravity(17);
        setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479919iy));
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479918ix);
        setPadding(f17, 0, f17, 0);
        setAllCaps(false);
        setTextColor(b3.l.getColorStateList(context, com.tencent.mm.R.color.f478838io));
        setBackgroundResource(com.tencent.mm.R.drawable.f481060jo);
        setText("Console");
    }
}
