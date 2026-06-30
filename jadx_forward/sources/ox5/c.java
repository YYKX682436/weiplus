package ox5;

/* loaded from: classes14.dex */
public class c implements android.view.ViewGroup.OnHierarchyChangeListener {
    public c(ox5.a aVar) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onChildViewAdded, view: " + view.toString() + "  view1: " + view2.toString(), new java.lang.Object[0]);
        io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139431xe8536ce3(view2, new io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.ViewVisitor() { // from class: ox5.c$$a
            @Override // io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.ViewVisitor
            public final boolean run(android.view.View view3) {
                ox5.c cVar = ox5.c.this;
                cVar.getClass();
                if (!android.view.TextureView.class.isInstance(view3)) {
                    return false;
                }
                nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "has TextureView: " + view3.toString(), new java.lang.Object[0]);
                android.view.TextureView textureView = (android.view.TextureView) view3;
                textureView.setSurfaceTextureListener(new ox5.e(cVar, textureView.getSurfaceTextureListener(), view3.getClass().getSimpleName().toLowerCase().contains("pagview"), textureView));
                return true;
            }
        });
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onChildViewRemoved, view: " + view.toString() + "  view1: " + view2.toString(), new java.lang.Object[0]);
    }
}
