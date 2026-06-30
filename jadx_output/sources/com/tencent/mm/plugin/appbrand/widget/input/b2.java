package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class b2 extends com.tencent.mm.plugin.appbrand.widget.input.e4 {
    public b2(android.content.Context context) {
        super(context);
        super.setHorizontallyScrolling(true);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public boolean d() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.t4
    public final boolean e() {
        return false;
    }

    @Override // android.view.View
    public final boolean isLaidOut() {
        boolean isLaidOut = super.isLaidOut();
        if (isLaidOut && isFocusable()) {
            if (!(getBottom() > getTop() && getRight() > getLeft())) {
                try {
                    java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                    if (stackTrace != null && stackTrace.length >= 3) {
                        if (stackTrace[2].getMethodName().equals("canTakeFocus")) {
                            return false;
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return isLaidOut;
    }

    @Override // android.widget.TextView
    public void setGravity(int i17) {
        super.setGravity((i17 & (-81) & (-49)) | 16);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView
    public final void setInputType(int i17) {
        super.setInputType(i17 & (-131073));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView
    public final void setSingleLine(boolean z17) {
    }
}
