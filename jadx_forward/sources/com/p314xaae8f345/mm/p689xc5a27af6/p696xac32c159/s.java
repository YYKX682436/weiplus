package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p0.class})
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
        if (drawable instanceof com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "attachAvatar, AvatarBitmapDrawable already set");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f) drawable).a(str);
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f fVar = new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f(str);
        if (!(imageView instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22509xc04419c1) && (imageView.isClickable() || imageView.isLongClickable())) {
            try {
                imageView.setOnTouchListener(new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.b(fVar, imageView));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(fVar.f146683a, e17, "attachToView fail", new java.lang.Object[0]);
            }
        }
        imageView.setImageDrawable(fVar);
    }
}
