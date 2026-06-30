package cm2;

/* loaded from: classes3.dex */
public final class n extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.alr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r13 == null) goto L39;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r17, in5.c r18, int r19, int r20, boolean r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm2.n.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("GameTogetherCardConvert", "onCreate, type: " + i17);
    }

    public final void n(r45.x63 x63Var, hq0.e0 e0Var) {
        com.tencent.mars.xlog.Log.i("GameTogetherCardConvert", "updateFrameSetView");
        java.lang.String string = x63Var.getString(3);
        com.tencent.mm.protobuf.g byteString = x63Var.getByteString(1);
        java.lang.String i17 = byteString != null ? byteString.i() : null;
        if (string != null && i17 != null) {
            if (string.length() > 0) {
                if (i17.length() > 0) {
                    hq0.e0.b(e0Var, i17, string, null, 4, null);
                }
            }
        }
        e0Var.g();
    }
}
