package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final /* synthetic */ class UseCaseAttachState$$b implements androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter {
    @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
    public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        boolean attached;
        attached = useCaseAttachInfo.getAttached();
        return attached;
    }
}
