package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class es implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu {
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu
    public android.graphics.Rect a() {
        android.view.View[] b17 = b();
        android.graphics.Rect rect = new android.graphics.Rect();
        for (android.view.View view : b17) {
            rect.union(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(view));
        }
        return rect;
    }

    public abstract android.view.View[] b();
}
