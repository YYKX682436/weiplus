package com.tencent.kinda.framework.widget.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public abstract class LifecycleFragment extends com.tencent.mm.ui.MMFragment implements com.tencent.kinda.framework.widget.base.FragmentLifecycle {
    private static final java.lang.String TAG = "MicroMsg.LifecycleFragment";
    protected com.tencent.kinda.framework.widget.base.LifecycleFragment.State mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.INITIAL;

    /* loaded from: classes9.dex */
    public enum State {
        INITIAL(0),
        CREATED(1),
        STARTED(2),
        RESUMED(3),
        PAUSED(4),
        STOPPED(5),
        DESTROYED(6);

        private int value;

        State(int i17) {
            this.value = i17;
        }
    }

    private void _callFragmentOnCreate() {
        if (this.mState == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.INITIAL) {
            this.mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.CREATED;
            onFragmentOnCreate();
        }
    }

    private void _callFragmentOnDestroy() {
        if (this.mState == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.STOPPED) {
            this.mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.DESTROYED;
            onFragmentOnDestroy();
        }
    }

    private void _callFragmentOnPause() {
        com.tencent.kinda.framework.widget.base.LifecycleFragment.State state = this.mState;
        if (state == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.RESUMED || state == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.STARTED) {
            this.mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.PAUSED;
            onFragmentOnPause();
        }
    }

    private void _callFragmentOnResume() {
        com.tencent.kinda.framework.widget.base.LifecycleFragment.State state = this.mState;
        if (state == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.STARTED || state == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.PAUSED) {
            this.mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.RESUMED;
            onFragmentOnResume();
        }
    }

    private void _callFragmentOnStart() {
        com.tencent.kinda.framework.widget.base.LifecycleFragment.State state = this.mState;
        if (state == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.CREATED || state == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.STOPPED) {
            this.mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.STARTED;
            onFragmentOnStart();
        }
    }

    private void _callFragmentOnStop() {
        if (this.mState == com.tencent.kinda.framework.widget.base.LifecycleFragment.State.PAUSED) {
            this.mState = com.tencent.kinda.framework.widget.base.LifecycleFragment.State.STOPPED;
            onFragmentOnStop();
        }
    }

    private void _fixCallOnResumeOrOnPause() {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.w(TAG, "null activity when call");
            return;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        if (fragments.size() < 1 || fragments.get(fragments.size() - 1) != this) {
            _callFragmentOnPause();
        } else {
            _callFragmentOnResume();
        }
    }

    private void _fixOnPauseNotCallingProblem() {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.w(TAG, "null activity when call");
            return;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        if (fragments.size() >= 2) {
            androidx.fragment.app.Fragment fragment = fragments.get(fragments.size() - 2);
            if (fragment instanceof com.tencent.kinda.framework.widget.base.LifecycleFragment) {
                ((com.tencent.kinda.framework.widget.base.LifecycleFragment) fragment)._callFragmentOnPause();
            }
        }
    }

    private void _fixOnResumeNotCallingProblem() {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.w(TAG, "null activity when call");
            return;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        if (fragments.size() >= 1) {
            androidx.fragment.app.Fragment fragment = fragments.get(fragments.size() - 1);
            if (fragment instanceof com.tencent.kinda.framework.widget.base.LifecycleFragment) {
                ((com.tencent.kinda.framework.widget.base.LifecycleFragment) fragment)._callFragmentOnResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        _callFragmentOnCreate();
        _fixOnPauseNotCallingProblem();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        _callFragmentOnDestroy();
        _fixOnResumeNotCallingProblem();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        _callFragmentOnDestroy();
        _fixOnResumeNotCallingProblem();
    }

    public void onFragmentOnCreate() {
        toString();
    }

    public void onFragmentOnDestroy() {
        toString();
    }

    public void onFragmentOnPause() {
        toString();
    }

    public void onFragmentOnResume() {
        toString();
    }

    public void onFragmentOnStart() {
        toString();
    }

    public void onFragmentOnStop() {
        toString();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        _callFragmentOnPause();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        _fixCallOnResumeOrOnPause();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        _callFragmentOnStart();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        _callFragmentOnStop();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        _callFragmentOnCreate();
        _fixOnPauseNotCallingProblem();
    }
}
