package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class r0 {
    public static p012xc85e97e9.p087x9da2e250.app.p0 a(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17, boolean z18) {
        int m7452x3889cd9e = componentCallbacksC1101xa17d4670.m7452x3889cd9e();
        int m7456x723b1c2e = z18 ? z17 ? componentCallbacksC1101xa17d4670.m7456x723b1c2e() : componentCallbacksC1101xa17d4670.m7457x4cf8ac8a() : z17 ? componentCallbacksC1101xa17d4670.m7439xcc408253() : componentCallbacksC1101xa17d4670.m7442xfd4b6dc5();
        boolean z19 = false;
        componentCallbacksC1101xa17d4670.m7560x2f1d5b71(0, 0, 0, 0);
        android.view.ViewGroup viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694;
        if (viewGroup != null && viewGroup.getTag(com.p314xaae8f345.mm.R.id.p3q) != null) {
            componentCallbacksC1101xa17d4670.f3420x62389694.setTag(com.p314xaae8f345.mm.R.id.p3q, null);
        }
        android.view.ViewGroup viewGroup2 = componentCallbacksC1101xa17d4670.f3420x62389694;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation mo7500x963e4609 = componentCallbacksC1101xa17d4670.mo7500x963e4609(m7452x3889cd9e, z17, m7456x723b1c2e);
        if (mo7500x963e4609 != null) {
            return new p012xc85e97e9.p087x9da2e250.app.p0(mo7500x963e4609);
        }
        android.animation.Animator mo7501x36651bc2 = componentCallbacksC1101xa17d4670.mo7501x36651bc2(m7452x3889cd9e, z17, m7456x723b1c2e);
        if (mo7501x36651bc2 != null) {
            return new p012xc85e97e9.p087x9da2e250.app.p0(mo7501x36651bc2);
        }
        if (m7456x723b1c2e == 0 && m7452x3889cd9e != 0) {
            m7456x723b1c2e = m7452x3889cd9e != 4097 ? m7452x3889cd9e != 4099 ? m7452x3889cd9e != 8194 ? -1 : z17 ? com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559495g : com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559496h : z17 ? com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559497i : com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559498j : z17 ? com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559499k : com.p314xaae8f345.mm.R.C30855xd09a2ae7.f559500l;
        }
        if (m7456x723b1c2e != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m7456x723b1c2e));
            if (equals) {
                try {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, m7456x723b1c2e);
                    if (loadAnimation != null) {
                        return new p012xc85e97e9.p087x9da2e250.app.p0(loadAnimation);
                    }
                    z19 = true;
                } catch (android.content.res.Resources.NotFoundException e17) {
                    throw e17;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            if (!z19) {
                try {
                    android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, m7456x723b1c2e);
                    if (loadAnimator != null) {
                        return new p012xc85e97e9.p087x9da2e250.app.p0(loadAnimator);
                    }
                } catch (java.lang.RuntimeException e18) {
                    if (equals) {
                        throw e18;
                    }
                    android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, m7456x723b1c2e);
                    if (loadAnimation2 != null) {
                        return new p012xc85e97e9.p087x9da2e250.app.p0(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }
}
