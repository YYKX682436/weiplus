package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B)\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007R2\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelMuxerController;", "Landroidx/lifecycle/k0;", "", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "", "allWorkSuccess", "p0", "Ljz5/f0;", "onChanged", "exportSuccess", "exportFail", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "Lkotlin/collections/ArrayList;", "exportWork", "Ljava/util/ArrayList;", "getExportWork", "()Ljava/util/ArrayList;", "setExportWork", "(Ljava/util/ArrayList;)V", "Landroid/os/Handler;", "exportHandler", "Landroid/os/Handler;", "getExportHandler", "()Landroid/os/Handler;", "setExportHandler", "(Landroid/os/Handler;)V", "<init>", "(Ljava/util/ArrayList;Landroid/os/Handler;)V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.core.parallel.control.ParallelMuxerController */
/* loaded from: classes15.dex */
public final class C25717x391b3ad2 implements p012xc85e97e9.p093xedfae76a.k0 {
    private android.os.Handler exportHandler;
    private java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041> exportWork;

    public C25717x391b3ad2(java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041> exportWork, android.os.Handler handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportWork, "exportWork");
        this.exportWork = exportWork;
        this.exportHandler = handler;
    }

    /* renamed from: allWorkSuccess */
    private final boolean m97014x5e57bb51() {
        java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041> arrayList = this.exportWork;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041) next).m97038xd4fd2f59().m97030x84e1a54f() != com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetReaderStatusWriteFinish) {
                    obj = next;
                    break;
                }
            }
            obj = (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041) obj;
        }
        return obj == null;
    }

    /* renamed from: exportFail */
    public final void m97015xc7164f2() {
    }

    /* renamed from: exportSuccess */
    public final void m97016xd14cf1af() {
        android.os.Handler handler = this.exportHandler;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.control.ParallelMuxerController$exportSuccess$1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final android.os.Handler getExportHandler() {
        return this.exportHandler;
    }

    /* renamed from: getExportWork */
    public final java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041> m97018xfaba0cdb() {
        return this.exportWork;
    }

    /* renamed from: setExportHandler */
    public final void m97020xba192bb4(android.os.Handler handler) {
        this.exportHandler = handler;
    }

    /* renamed from: setExportWork */
    public final void m97021x28de5ae7(java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041> arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<set-?>");
        this.exportWork = arrayList;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged, reason: merged with bridge method [inline-methods] */
    public void mo525x7bb163d5(java.util.List<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2956xa3009fa4.C25730x7e4a5415> list) {
        boolean z17 = false;
        if (list != null && list.size() == this.exportWork.size()) {
            z17 = true;
        }
        if (z17) {
            if (m97014x5e57bb51()) {
                m97016xd14cf1af();
            } else {
                m97015xc7164f2();
            }
        }
    }
}
