package com.tencent.mm.plugin.expt.pageflow;

/* loaded from: classes13.dex */
public class j implements java.util.Comparator {
    public j(com.tencent.mm.plugin.expt.pageflow.k kVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct) obj).f58845f, ((com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct) obj2).f58845f);
    }
}
