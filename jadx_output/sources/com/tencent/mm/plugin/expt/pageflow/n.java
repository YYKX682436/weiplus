package com.tencent.mm.plugin.expt.pageflow;

/* loaded from: classes13.dex */
public class n implements java.util.Comparator {
    public n(com.tencent.mm.plugin.expt.pageflow.o oVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct) obj).f59828i, ((com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct) obj2).f59828i);
    }
}
