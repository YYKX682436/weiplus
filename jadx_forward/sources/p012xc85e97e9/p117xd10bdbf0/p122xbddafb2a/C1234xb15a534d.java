package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "Ljz5/f0;", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "activityToListeners", "Ljava/util/Map;", "listenerToActivity", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "MulticastConsumer", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.layout.ExtensionWindowLayoutInfoBackend */
/* loaded from: classes13.dex */
public final class C1234xb15a534d implements p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464 {
    private final java.util.Map<android.app.Activity, p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d.MulticastConsumer> activityToListeners;
    private final androidx.window.extensions.layout.WindowLayoutComponent component;
    private final java.util.concurrent.locks.ReentrantLock extensionWindowBackendLock;
    private final java.util.Map<m3.a, android.app.Activity> listenerToActivity;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Ljz5/f0;", "accept", "Lm3/a;", "Landroidx/window/layout/WindowLayoutInfo;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "addListener", "removeListener", "", "isEmpty", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "", "registeredListeners", "Ljava/util/Set;", "<init>", "(Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.ExtensionWindowLayoutInfoBackend$MulticastConsumer */
    /* loaded from: classes13.dex */
    public static final class MulticastConsumer implements java.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        private final android.app.Activity activity;
        private p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 lastKnownValue;
        private final java.util.concurrent.locks.ReentrantLock multicastConsumerLock;
        private final java.util.Set<m3.a> registeredListeners;

        public MulticastConsumer(android.app.Activity activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new java.util.concurrent.locks.ReentrantLock();
            this.registeredListeners = new java.util.LinkedHashSet();
        }

        /* renamed from: addListener */
        public final void m8542x162a7075(m3.a listener) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 c1249xd38bff28 = this.lastKnownValue;
                if (c1249xd38bff28 != null) {
                    listener.mo3938xab27b508(c1249xd38bff28);
                }
                this.registeredListeners.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: isEmpty */
        public final boolean m8543x7aab3243() {
            return this.registeredListeners.isEmpty();
        }

        /* renamed from: removeListener */
        public final void m8544xf1335d58(m3.a listener) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo value) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1235x8e231c53.f3871x4fbc8495.m8548x72534ce(this.activity, value);
                java.util.Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((m3.a) it.next()).mo3938xab27b508(this.lastKnownValue);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public C1234xb15a534d(androidx.window.extensions.layout.WindowLayoutComponent component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new java.util.concurrent.locks.ReentrantLock();
        this.activityToListeners = new java.util.LinkedHashMap();
        this.listenerToActivity = new java.util.LinkedHashMap();
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464
    /* renamed from: registerLayoutChangeCallback */
    public void mo8540x5ea79122(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d.MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                f0Var = null;
            } else {
                multicastConsumer.m8542x162a7075(callback);
                this.listenerToActivity.put(callback, activity);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d.MulticastConsumer multicastConsumer2 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d.MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(callback, activity);
                multicastConsumer2.m8542x162a7075(callback);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464
    /* renamed from: unregisterLayoutChangeCallback */
    public void mo8541x6de6303b(m3.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            android.app.Activity activity = this.listenerToActivity.get(callback);
            if (activity == null) {
                return;
            }
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d.MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.m8544xf1335d58(callback);
            if (multicastConsumer.m8543x7aab3243()) {
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
