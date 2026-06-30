package com.tencent.mm.feature.appmsg.ui.uic;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/feature/appmsg/ui/uic/RecordDetailItemConvertFactory;", "Lin5/s;", "", "type", "Lwu/p;", "getItemConvert", "Lhu/f;", "uiParams", "Lhu/f;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lhu/b;", "mvvmList", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "<init>", "(Lhu/f;Lcom/tencent/mm/plugin/mvvmlist/MvvmList;)V", "feature-appmsg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class RecordDetailItemConvertFactory implements in5.s {
    private final com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList;
    private final hu.f uiParams;

    public RecordDetailItemConvertFactory(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
        this.uiParams = uiParams;
        this.mvvmList = mvvmList;
    }

    @Override // in5.s
    public wu.p getItemConvert(int type) {
        return wu.b2.f449545a.a(type, this.uiParams, this.mvvmList);
    }
}
