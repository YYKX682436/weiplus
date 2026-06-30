package com.tencent.mm.feature.avatar;

@j95.b(dependencies = {com.tencent.mm.ipcinvoker.wx_extension.p0.class})
/* loaded from: classes5.dex */
public final class s extends i95.w implements kv.y {
    public void wi(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        imageView.toString();
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable instanceof com.tencent.mm.feature.avatar.f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "attachAvatar, AvatarBitmapDrawable already set");
            ((com.tencent.mm.feature.avatar.f) drawable).a(str);
            return;
        }
        com.tencent.mm.feature.avatar.f fVar = new com.tencent.mm.feature.avatar.f(str);
        if (!(imageView instanceof com.tencent.mm.ui.tools.MaskImageButton) && (imageView.isClickable() || imageView.isLongClickable())) {
            try {
                imageView.setOnTouchListener(new com.tencent.mm.feature.avatar.b(fVar, imageView));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(fVar.f65150a, e17, "attachToView fail", new java.lang.Object[0]);
            }
        }
        imageView.setImageDrawable(fVar);
    }
}
