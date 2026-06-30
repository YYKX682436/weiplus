package r02;

/* loaded from: classes8.dex */
public class m implements r02.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449846a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5) {
        this.f449846a = activityC13242xdf6880d5;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449846a;
        if (z17) {
            activityC13242xdf6880d5.f178906e.setVisibility(0);
            activityC13242xdf6880d5.f178906e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(activityC13242xdf6880d5, com.p314xaae8f345.mm.R.C30854x2dc211.f559283ad));
            activityC13242xdf6880d5.f178907f.setVisibility(0);
            activityC13242xdf6880d5.f178907f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(activityC13242xdf6880d5, com.p314xaae8f345.mm.R.C30854x2dc211.f559450f5));
            return;
        }
        activityC13242xdf6880d5.f178906e.setVisibility(8);
        activityC13242xdf6880d5.f178906e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(activityC13242xdf6880d5, com.p314xaae8f345.mm.R.C30854x2dc211.f559284ae));
        activityC13242xdf6880d5.f178907f.setVisibility(8);
        activityC13242xdf6880d5.f178907f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(activityC13242xdf6880d5, com.p314xaae8f345.mm.R.C30854x2dc211.f559451f6));
    }
}
