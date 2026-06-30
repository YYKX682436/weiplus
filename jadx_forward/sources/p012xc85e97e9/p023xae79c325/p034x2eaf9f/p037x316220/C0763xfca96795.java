package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.UseCaseAttachState */
/* loaded from: classes14.dex */
public final class C0763xfca96795 {
    private static final java.lang.String TAG = "UseCaseAttachState";

    /* renamed from: mAttachedUseCasesToInfoMap */
    private final java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> f1820x8d39c706 = new java.util.LinkedHashMap();

    /* renamed from: mCameraId */
    private final java.lang.String f1821x1c133ead;

    /* renamed from: androidx.camera.core.impl.UseCaseAttachState$AttachStateFilter */
    /* loaded from: classes14.dex */
    public interface AttachStateFilter {
        /* renamed from: filter */
        boolean mo5731xb408cb78(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo);
    }

    /* renamed from: androidx.camera.core.impl.UseCaseAttachState$UseCaseAttachInfo */
    /* loaded from: classes14.dex */
    public static final class UseCaseAttachInfo {

        /* renamed from: mCaptureTypes */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> f1824xc4b555e0;

        /* renamed from: mSessionConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 f1825x3700320b;

        /* renamed from: mStreamSpec */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b f1826x94faf3a8;

        /* renamed from: mUseCaseConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f1827xaebf740c;

        /* renamed from: mAttached */
        private boolean f1823x451a2531 = false;

        /* renamed from: mActive */
        private boolean f1822xfa9ba5d3 = false;

        public UseCaseAttachInfo(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
            this.f1825x3700320b = c0750xb915958;
            this.f1827xaebf740c = interfaceC0768x83509b59;
            this.f1826x94faf3a8 = abstractC0756x2f9ad77b;
            this.f1824xc4b555e0 = list;
        }

        /* renamed from: getActive */
        public boolean m5732x1046a1fc() {
            return this.f1822xfa9ba5d3;
        }

        /* renamed from: getAttached */
        public boolean m5733x9bf6bb1a() {
            return this.f1823x451a2531;
        }

        /* renamed from: getCaptureTypes */
        public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> m5734x8e12cf49() {
            return this.f1824xc4b555e0;
        }

        /* renamed from: getSessionConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5735x9951e5c2() {
            return this.f1825x3700320b;
        }

        /* renamed from: getStreamSpec */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m5736xa709b351() {
            return this.f1826x94faf3a8;
        }

        /* renamed from: getUseCaseConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m5737x111127c3() {
            return this.f1827xaebf740c;
        }

        /* renamed from: setActive */
        public void m5738x37bd608(boolean z17) {
            this.f1822xfa9ba5d3 = z17;
        }

        /* renamed from: setAttached */
        public void m5739x96af1c26(boolean z17) {
            this.f1823x451a2531 = z17;
        }

        /* renamed from: toString */
        public java.lang.String m5740x9616526c() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f1825x3700320b + ", mUseCaseConfig=" + this.f1827xaebf740c + ", mStreamSpec=" + this.f1826x94faf3a8 + ", mCaptureTypes=" + this.f1824xc4b555e0 + ", mAttached=" + this.f1823x451a2531 + ", mActive=" + this.f1822xfa9ba5d3 + '}';
        }
    }

    public C0763xfca96795(java.lang.String str) {
        this.f1821x1c133ead = str;
    }

    /* renamed from: getOrCreateUseCaseAttachInfo */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo m5710x6b0ebf95(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo = this.f1820x8d39c706.get(str);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo(c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
        this.f1820x8d39c706.put(str, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    /* renamed from: getSessionConfigs */
    private java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> m5711x90ead2f1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> entry : this.f1820x8d39c706.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.mo5731xb408cb78(entry.getValue())) {
                arrayList.add(entry.getValue().m5735x9951e5c2());
            }
        }
        return arrayList;
    }

    /* renamed from: getUseCaseConfigs */
    private java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> m5712x1113d110(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> entry : this.f1820x8d39c706.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.mo5731xb408cb78(entry.getValue())) {
                arrayList.add(entry.getValue().m5737x111127c3());
            }
        }
        return arrayList;
    }

    /* renamed from: getUseCaseInfo */
    private java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> m5713x2774356f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> entry : this.f1820x8d39c706.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.mo5731xb408cb78(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getActiveAndAttachedSessionConfigs$3 */
    public static /* synthetic */ boolean m5714x7a9ada6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.m5732x1046a1fc() && useCaseAttachInfo.m5733x9bf6bb1a();
    }

    /* renamed from: getActiveAndAttachedBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder m5718x9217f59c() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder validatingBuilder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> entry : this.f1820x8d39c706.entrySet()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo value = entry.getValue();
            if (value.m5732x1046a1fc() && value.m5733x9bf6bb1a()) {
                java.lang.String key = entry.getKey();
                validatingBuilder.add(value.m5735x9951e5c2());
                arrayList.add(key);
            }
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Active and attached use case: " + arrayList + " for camera: " + this.f1821x1c133ead);
        return validatingBuilder;
    }

    /* renamed from: getActiveAndAttachedSessionConfigs */
    public java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> m5719x66d6cda() {
        return java.util.Collections.unmodifiableCollection(m5711x90ead2f1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0767x85cd802f()));
    }

    /* renamed from: getAttachedBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder m5720x9cebfb21() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder validatingBuilder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> entry : this.f1820x8d39c706.entrySet()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo value = entry.getValue();
            if (value.m5733x9bf6bb1a()) {
                validatingBuilder.add(value.m5735x9951e5c2());
                arrayList.add(entry.getKey());
            }
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "All use case: " + arrayList + " for camera: " + this.f1821x1c133ead);
        return validatingBuilder;
    }

    /* renamed from: getAttachedSessionConfigs */
    public java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> m5721x42f617b5() {
        return java.util.Collections.unmodifiableCollection(m5711x90ead2f1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0764x85cd802c()));
    }

    /* renamed from: getAttachedUseCaseConfigs */
    public java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> m5722xc31f15d4() {
        return java.util.Collections.unmodifiableCollection(m5712x1113d110(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0766x85cd802e()));
    }

    /* renamed from: getAttachedUseCaseInfo */
    public java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo> m5723xab28c72b() {
        return java.util.Collections.unmodifiableCollection(m5713x2774356f(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0765x85cd802d()));
    }

    /* renamed from: isUseCaseAttached */
    public boolean m5724x9e7aa591(java.lang.String str) {
        if (this.f1820x8d39c706.containsKey(str)) {
            return this.f1820x8d39c706.get(str).m5733x9bf6bb1a();
        }
        return false;
    }

    /* renamed from: removeUseCase */
    public void m5725x3e675c33(java.lang.String str) {
        this.f1820x8d39c706.remove(str);
    }

    /* renamed from: setUseCaseActive */
    public void m5726x9fd789fb(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        m5710x6b0ebf95(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list).m5738x37bd608(true);
    }

    /* renamed from: setUseCaseAttached */
    public void m5727x8aed9f59(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        m5710x6b0ebf95(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list).m5739x96af1c26(true);
        m5730x9dfb344e(str, c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
    }

    /* renamed from: setUseCaseDetached */
    public void m5728xa913ad27(java.lang.String str) {
        if (this.f1820x8d39c706.containsKey(str)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo = this.f1820x8d39c706.get(str);
            useCaseAttachInfo.m5739x96af1c26(false);
            if (useCaseAttachInfo.m5732x1046a1fc()) {
                return;
            }
            this.f1820x8d39c706.remove(str);
        }
    }

    /* renamed from: setUseCaseInactive */
    public void m5729x6c497e20(java.lang.String str) {
        if (this.f1820x8d39c706.containsKey(str)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo = this.f1820x8d39c706.get(str);
            useCaseAttachInfo.m5738x37bd608(false);
            if (useCaseAttachInfo.m5733x9bf6bb1a()) {
                return;
            }
            this.f1820x8d39c706.remove(str);
        }
    }

    /* renamed from: updateUseCase */
    public void m5730x9dfb344e(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list) {
        if (this.f1820x8d39c706.containsKey(str)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo(c0750xb915958, interfaceC0768x83509b59, abstractC0756x2f9ad77b, list);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0763xfca96795.UseCaseAttachInfo useCaseAttachInfo2 = this.f1820x8d39c706.get(str);
            useCaseAttachInfo.m5739x96af1c26(useCaseAttachInfo2.m5733x9bf6bb1a());
            useCaseAttachInfo.m5738x37bd608(useCaseAttachInfo2.m5732x1046a1fc());
            this.f1820x8d39c706.put(str, useCaseAttachInfo);
        }
    }
}
