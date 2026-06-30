package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraCaptureCallbacks */
/* loaded from: classes14.dex */
public final class C0660x3e5cd98d {

    /* renamed from: androidx.camera.core.impl.CameraCaptureCallbacks$ComboCameraCaptureCallback */
    /* loaded from: classes14.dex */
    public static final class ComboCameraCaptureCallback extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 {

        /* renamed from: mCallbacks */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> f1494x3c7f32e1 = new java.util.ArrayList();

        public ComboCameraCaptureCallback(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list) {
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6 : list) {
                if (!(abstractC0659xd0769ba6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0660x3e5cd98d.NoOpCameraCaptureCallback)) {
                    this.f1494x3c7f32e1.add(abstractC0659xd0769ba6);
                }
            }
        }

        /* renamed from: getCallbacks */
        public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> m5221xc1355a18() {
            return this.f1494x3c7f32e1;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureCancelled */
        public void mo3015xa4d204aa(int i17) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f1494x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().mo3015xa4d204aa(i17);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureCompleted */
        public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f1494x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().mo3016x34cad1a4(i17, interfaceC0663xe081a7be);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureFailed */
        public void mo3017x90bd1f84(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f1494x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().mo3017x90bd1f84(i17, c0661xad844609);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureProcessProgressed */
        public void mo4951x1c9165b4(int i17, int i18) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f1494x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().mo4951x1c9165b4(i17, i18);
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureStarted */
        public void mo4952x56961e1a(int i17) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = this.f1494x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().mo4952x56961e1a(i17);
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraCaptureCallbacks$NoOpCameraCaptureCallback */
    /* loaded from: classes14.dex */
    public static final class NoOpCameraCaptureCallback extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 {
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureCompleted */
        public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureFailed */
        public void mo3017x90bd1f84(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609 c0661xad844609) {
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureStarted */
        public void mo4952x56961e1a(int i17) {
        }
    }

    private C0660x3e5cd98d() {
    }

    /* renamed from: createComboCallback */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m5218x20225057(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> list) {
        if (list.isEmpty()) {
            return m5220x8e6ae903();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0660x3e5cd98d.ComboCameraCaptureCallback(list);
    }

    /* renamed from: createNoOpCallback */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m5220x8e6ae903() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0660x3e5cd98d.NoOpCameraCaptureCallback();
    }

    /* renamed from: createComboCallback */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m5219x20225057(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6... abstractC0659xd0769ba6Arr) {
        return m5218x20225057((java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6>) java.util.Arrays.asList(abstractC0659xd0769ba6Arr));
    }
}
