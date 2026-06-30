package com.p314xaae8f345.mm.ui.p2730xe821e364;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/recyclerview/SynchronizedAdapter;", "Landroidx/recyclerview/widget/k3;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroidx/recyclerview/widget/f2;", "Landroid/view/View;", "itemView", "", "isAsyncView", "holder", "", "position", "", "", "payloads", "Ljz5/f0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/k3;ILjava/util/List;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "isEnableSynchronized", "Z", "()Z", "setEnableSynchronized", "(Z)V", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.recyclerview.SynchronizedAdapter */
/* loaded from: classes5.dex */
public abstract class AbstractC22470xf90b5f7b<T extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3> extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {
    private boolean isEnableSynchronized;
    private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: isAsyncView */
    private final boolean m80895xe0755537(android.view.View itemView) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemView.getTag(com.p314xaae8f345.mm.R.id.f563883c5), 1);
    }

    /* renamed from: isEnableSynchronized, reason: from getter */
    public final boolean getIsEnableSynchronized() {
        return this.isEnableSynchronized;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(T holder, int position, java.util.List<java.lang.Object> payloads) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (!this.isEnableSynchronized) {
            super.mo8157xe5e2e48d(holder, position, payloads);
            return;
        }
        try {
            long nanoTime = java.lang.System.nanoTime();
            this.lock.lock();
            long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    super.mo8157xe5e2e48d(holder, position, payloads);
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                java.util.HashMap hashMap = oj5.r.f427410h;
                java.lang.String str = (java.lang.String) oj5.r.f427410h.get(java.lang.Integer.valueOf(hashCode()));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindViewHolder] waitLock=");
                sb6.append(nanoTime2);
                sb6.append("ns position=");
                sb6.append(position);
                sb6.append(" isAsyncView=");
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                sb6.append(m80895xe0755537(itemView));
                sb6.append(" throwable=");
                sb6.append(m143898xd4a2fc34 != null ? m143898xd4a2fc34.getMessage() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (m143898xd4a2fc34 != null) {
                    throw m143898xd4a2fc34;
                }
            } else {
                super.mo8157xe5e2e48d(holder, position, payloads);
            }
        } finally {
            if (this.lock.isHeldByCurrentThread()) {
                this.lock.unlock();
            }
        }
    }

    /* renamed from: setEnableSynchronized */
    public final void m80897xd4fab639(boolean z17) {
        this.isEnableSynchronized = z17;
    }
}
