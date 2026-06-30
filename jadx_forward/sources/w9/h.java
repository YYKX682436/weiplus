package w9;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final x.n f525579a = new x.n();

    public static w9.h a(android.content.Context context, android.content.res.TypedArray typedArray, int i17) {
        int resourceId;
        if (!typedArray.hasValue(i17) || (resourceId = typedArray.getResourceId(i17, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static w9.h b(android.content.Context context, int i17) {
        try {
            android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i17);
            if (loadAnimator instanceof android.animation.AnimatorSet) {
                return c(((android.animation.AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (java.lang.Exception unused) {
            java.lang.Integer.toHexString(i17);
            return null;
        }
    }

    public static w9.h c(java.util.List list) {
        w9.h hVar = new w9.h();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i17);
            if (!(animator instanceof android.animation.ObjectAnimator)) {
                throw new java.lang.IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            java.lang.String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            android.animation.TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof android.view.animation.AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = w9.a.f525568b;
            } else if (interpolator instanceof android.view.animation.AccelerateInterpolator) {
                interpolator = w9.a.f525569c;
            } else if (interpolator instanceof android.view.animation.DecelerateInterpolator) {
                interpolator = w9.a.f525570d;
            }
            w9.i iVar = new w9.i(startDelay, duration, interpolator);
            iVar.f525583d = objectAnimator.getRepeatCount();
            iVar.f525584e = objectAnimator.getRepeatMode();
            hVar.f525579a.put(propertyName, iVar);
        }
        return hVar;
    }

    public w9.i d(java.lang.String str) {
        x.n nVar = this.f525579a;
        if (nVar.m174751x4aabfc28(str, null) != null) {
            return (w9.i) nVar.m174751x4aabfc28(str, null);
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: equals */
    public boolean m173343xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w9.h.class != obj.getClass()) {
            return false;
        }
        return this.f525579a.m174750xb2c87fbf(((w9.h) obj).f525579a);
    }

    /* renamed from: hashCode */
    public int m173344x8cdac1b() {
        return this.f525579a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173345x9616526c() {
        return "\n" + w9.h.class.getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " timings: " + this.f525579a + "}\n";
    }
}
