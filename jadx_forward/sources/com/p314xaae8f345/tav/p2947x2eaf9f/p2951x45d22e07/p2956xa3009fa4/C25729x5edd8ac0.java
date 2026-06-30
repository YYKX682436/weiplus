package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R<\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0013j\b\u0012\u0004\u0012\u00020\r`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelResultViewModel;", "Landroidx/lifecycle/c1;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "work", "Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "status", "Lcom/tencent/tav/core/ExportErrorStatus;", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, "Ljz5/f0;", "updateWorkResult", "updateWorkResultSuccess", "Landroidx/lifecycle/j0;", "", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "<set-?>", "resultLiveData", "Landroidx/lifecycle/j0;", "getResultLiveData", "()Landroidx/lifecycle/j0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "resultList", "Ljava/util/ArrayList;", "<init>", "()V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.core.parallel.viewmodel.ParallelResultViewModel */
/* loaded from: classes15.dex */
public final class C25729x5edd8ac0 extends p012xc85e97e9.p093xedfae76a.c1 {
    private p012xc85e97e9.p093xedfae76a.j0 resultLiveData = new p012xc85e97e9.p093xedfae76a.j0();
    private final java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415> resultList = new java.util.ArrayList<>();

    public final p012xc85e97e9.p093xedfae76a.j0 getResultLiveData() {
        return this.resultLiveData;
    }

    /* renamed from: updateWorkResult */
    public final void m97153x7b7f9837(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 work, com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus status, com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 errorCode) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(work, "work");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        java.util.Iterator<T> it = this.resultList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415) obj).m97163xa9d6b3a7(), work.m97038xd4fd2f59())) {
                    break;
                }
            }
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415 c25730x7e4a5415 = (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415) obj;
        if (c25730x7e4a5415 != null) {
            c25730x7e4a5415.m97168x231a26f4(status);
            c25730x7e4a5415.m97166xce5d7784(errorCode);
        } else {
            java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415> arrayList = this.resultList;
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb m97038xd4fd2f59 = work.m97038xd4fd2f59();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m97038xd4fd2f59, "getIndicator(...)");
            arrayList.add(new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415(m97038xd4fd2f59, status, errorCode));
        }
        this.resultLiveData.mo7808x76db6cb1(this.resultList);
    }

    /* renamed from: updateWorkResultSuccess */
    public final void m97154x5f93e3cc(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 work) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(work, "work");
        m97153x7b7f9837(work, com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusCompleted, new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(0));
    }
}
