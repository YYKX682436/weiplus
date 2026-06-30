package r20;

/* loaded from: classes9.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10557x47452fe5 f450299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f450300e;

    public a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10557x47452fe5 c10557x47452fe5, android.view.View view) {
        this.f450299d = c10557x47452fe5;
        this.f450300e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10557x47452fe5 c10557x47452fe5 = this.f450299d;
        c10557x47452fe5.f147483o = (c10557x47452fe5.f147483o + 1) % ((java.util.ArrayList) c10557x47452fe5.f147480i).size();
        c10557x47452fe5.removeView(this.f450300e);
        c10557x47452fe5.f147478g.postDelayed(c10557x47452fe5.f147479h, c10557x47452fe5.f147477f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
